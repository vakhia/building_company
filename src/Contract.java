public class Contract {
    private Contractor contractor;
    private Client client;
    private int width;
    private int height;
    private int length;

    private void setContractor(Contractor contractor) {
        if(contractor.isSeal_stamp()){
            this.contractor = contractor;
        } else {
            throw new NullPointerException("Contractor doesn't have a seal stamp to sign this contract");
        }
    }

    private void setClient(Client client) {
        if(client.getMoneyForBuilding()>0){
            this.client = client;
        } else {
            throw new IllegalArgumentException("Client doesn't have money");
        }
    }

    private void setWidth(int width) {
        if(width>0){
            this.width = width;
        } else {
            throw  new IllegalArgumentException("Width cannot be null!");
        }
    }

    private void setHeight(int height) {
       if(height>0){
           this.height = height;
       } else {
           throw new IllegalArgumentException("Height cannot be null!");
       }
    }

    private void setLength(int length) {
        if(length>0){
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be null!");
        }
    }

    public Contract(Contractor contractor, Client client, int width, int height, int length) {
        this.setContractor(contractor);
        this.setClient(client);
        this.setHeight(height);
        this.setLength(length);
        this.setWidth(width);
    }

}
