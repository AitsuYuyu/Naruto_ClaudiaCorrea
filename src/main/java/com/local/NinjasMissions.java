package com.local;

public class NinjasMissions {
    private enum Status {COMPLETE, FAILED, PROGRESS}

    private String description;
    private Missions missions;
    private InterfazNinjas nameNinjas;
    private String startDate;
    private String endDate;
    private Status estado;

    public NinjasMissions() {}

    public NinjasMissions(String description, Missions missions, InterfazNinjas nameNinjas, String startDate, String endDate, Status estado) {
        this.description = description;
        this.missions = missions;
        this.nameNinjas = nameNinjas;
        this.startDate = startDate;
        this.endDate = endDate;
        this.estado = estado;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Missions getMissions() {
        return this.missions;
    }

    public void setMissions(Missions missions) {
        this.missions = missions;
    }

    public InterfazNinjas getNameNinjas() {
        return this.nameNinjas;
    }

    public void setNameNinjas(InterfazNinjas nameNinjas) {
        this.nameNinjas = nameNinjas;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Status getEstado() {
        return this.estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "{" +
            " description='" + getDescription() + "'" +
            ", missions='" + getMissions() + "'" +
            ", nameNinjas='" + getNameNinjas() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }
}
