package Interfaces;

public interface ISupplier extends IPerson {
    void BuyMaterials(int money);
    String Transport(String position,int quantityOfMaterials);
}
