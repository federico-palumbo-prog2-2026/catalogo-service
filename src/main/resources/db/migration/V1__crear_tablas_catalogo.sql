CREATE TABLE professional_category (
                                       id          BIGINT       PRIMARY KEY,
                                       name        VARCHAR(150) NOT NULL,
                                       description TEXT,
                                       enabled     BOOLEAN      NOT NULL,
                                       created_at  TIMESTAMPTZ  NOT NULL,
                                       updated_at  TIMESTAMPTZ  NOT NULL
);

CREATE TABLE professional (
                              id          BIGINT       PRIMARY KEY,
                              category_id BIGINT       NOT NULL REFERENCES professional_category (id),
                              first_name  VARCHAR(100) NOT NULL,
                              last_name   VARCHAR(100) NOT NULL,
                              enabled     BOOLEAN      NOT NULL,
                              created_at  TIMESTAMPTZ  NOT NULL,
                              updated_at  TIMESTAMPTZ  NOT NULL
);

CREATE INDEX idx_professional_category ON professional (category_id);

CREATE TABLE weekly_schedule (
                                 id                    BIGINT      PRIMARY KEY,
                                 professional_id       BIGINT      NOT NULL REFERENCES professional (id),
                                 day_of_week           VARCHAR(9)  NOT NULL
                                     CHECK (day_of_week IN ('MONDAY','TUESDAY','WEDNESDAY','THURSDAY','FRIDAY','SATURDAY','SUNDAY')),
                                 start_time            TIME        NOT NULL,
                                 end_time              TIME        NOT NULL,
                                 slot_duration_minutes INTEGER     NOT NULL,
                                 enabled               BOOLEAN     NOT NULL,
                                 created_at            TIMESTAMPTZ NOT NULL,
                                 updated_at            TIMESTAMPTZ NOT NULL
);

CREATE INDEX idx_weekly_schedule_professional ON weekly_schedule (professional_id);

CREATE TABLE catalog_sync_state (
                                    id            SMALLINT    PRIMARY KEY CHECK (id = 1),
                                    local_version BIGINT      NOT NULL,
                                    synced_at     TIMESTAMPTZ
);

INSERT INTO catalog_sync_state (id, local_version, synced_at) VALUES (1, 0, NULL);