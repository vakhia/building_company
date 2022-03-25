public final class Contract {
    private Contractor contractor;
    private Client client;
    private int width;
    private int height;
    private int length;

    public Contractor getContractor() {
        return contractor;
    }

    public Client getClient() {
        return client;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void setContractor(Contractor contractor) {
        if(contractor.isSeal_stamp()){
            this.contractor = contractor;
        } else {
            throw new NullPointerException("Contractor doesn't have a seal stamp to sign this contract");
        }
    }

    public void setClient(Client client) {
        if(client.getMoneyForBuilding()>0){
            this.client = client;
        } else {
            throw new IllegalArgumentException("Client doesn't have money");
        }
    }

    public void setWidth(int width) {
        if(width>0){
            this.width = width;
        } else {
            throw  new IllegalArgumentException("Width cannot be null!");
        }
    }

    public void setHeight(int height) {
       if(height>0){
           this.height = height;
       } else {
           throw new IllegalArgumentException("Height cannot be null!");
       }
    }

    public void setLength(int length) {
        if(length>0){
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be null!");
        }
    }

    public Contract(){

    }

    public Contract(Contractor contractor, Client client, int width, int height, int length) {
        this.contractor = contractor;
        this.client = client;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Contract =" +
                "contractor =" + contractor +
                ", client =" + client +
                ", width =" + width +
                ", height =" + height +
                ", length =" + length;
    }
}
