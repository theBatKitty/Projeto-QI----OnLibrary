public class Progresso {
    private int id;
    private int usuarioId;
    private int aulaId;
    private String status;

    public Progresso(int id, int usuarioId, int aulaId, String status) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.aulaId = aulaId;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUsuarioId() { return usuarioId; }
    public void setUsuarioId(int usuarioId) { this.usuarioId = usuarioId; }

    public int getAulaId() { return aulaId; }
    public void setAulaId(int aulaId) { this.aulaId = aulaId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
