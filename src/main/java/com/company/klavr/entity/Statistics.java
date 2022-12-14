package com.company.klavr.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "STATISTICS_", indexes = {
        @Index(name = "IDX_STATISTICS_STATISTICSTOEXE", columnList = "STATISTICS_TO_EXERCISE_ID"),
        @Index(name = "IDX_STATISTICS_STATISTICSTOUSE", columnList = "STATISTICS_TO_USER_ID")
})
@Entity(name = "Statistics_")
public class Statistics {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "FINISH_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date finishDate;

    @JoinColumn(name = "STATISTICS_TO_EXERCISE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Exercise statistics_to_exercise;

    @JoinColumn(name = "STATISTICS_TO_USER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User statistics_to_user;

    @Column(name = "EXERCISE_LENGTH", nullable = false)
    @NotNull
    private Integer exerciseLength;

    @Column(name = "MISTAKES_COUNT", nullable = false)
    @NotNull
    private Integer mistakesCount;

    @Column(name = "MAX_MISTAKES", nullable = false)
    @NotNull
    private String maxMistakes;

    @Column(name = "TIMER", nullable = false)
    @NotNull
    private Integer timer;

    @Column(name = "SPEED", nullable = false)
    @NotNull
    private Integer speed;

    public User getStatistics_to_user() {
        return statistics_to_user;
    }

    public Exercise getStatistics_to_exercise() {
        return statistics_to_exercise;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getTimer() {
        return timer;
    }

    public String getMaxMistakes() {
        return maxMistakes;
    }

    public Integer getMistakesCount() {
        return mistakesCount;
    }

    public Integer getExerciseLength() {
        return exerciseLength;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}