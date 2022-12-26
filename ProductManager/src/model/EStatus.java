package model;

public enum EStatus {
    CONFIRMED(1),COMPLETED(2),CANCELLED(3);
    private long id;
    EStatus(int id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public static EStatus changeStatus(int id){
        for (EStatus status : values()) {
            if (status.id == id) {
                return status;
            }
        }
        return null;
    }
}
