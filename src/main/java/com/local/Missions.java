package com.local;
public class Missions {
    private String description;
    private String rango;
    private String reward;


    public Missions() {
    }

    public Missions(String description, String rango, String reward) {
        this.description = description;
        this.rango = rango;
        this.reward = reward;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRango() {
        return this.rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getReward() {
        return this.reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Missions description(String description) {
        setDescription(description);
        return this;
    }

    public Missions rango(String rango) {
        setRango(rango);
        return this;
    }

    public Missions reward(String reward) {
        setReward(reward);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " description='" + getDescription() + "'" +
            ", rango='" + getRango() + "'" +
            ", reward='" + getReward() + "'" +
            "}";
    }


    static class MissionsBuilder{
        private Missions missionss;
        public MissionsBuilder(){
            this.missionss = new Missions();
        }
        public MissionsBuilder setDescription(String description){
            missionss.description = description;
            return this;
        }
        public MissionsBuilder setRango(String rango){
        missionss.rango = rango;
            return this;
        }
        public MissionsBuilder setReward(String reward){
            missionss.reward = reward;
            return this;
        }
        public Missions build(){
            return missionss;

        }

    }

}
