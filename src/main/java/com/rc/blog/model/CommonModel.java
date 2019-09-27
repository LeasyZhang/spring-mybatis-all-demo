package com.rc.blog.model;

import java.io.Serializable;
import java.time.Instant;

public abstract class CommonModel implements Serializable {

    private long id;

    private Instant createdTime;

    private Instant updatedTime;

    public long getId() {
        return id;
    }

    public Instant getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Instant createdTime) {
        this.createdTime = createdTime;
    }

    public Instant getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Instant updatedTime) {
        this.updatedTime = updatedTime;
    }
}
