package AdvancedCoding;

public class Tiers {
    private String tyreType;
    private String [] tyreBrand = new String[2];
    private int brandCount;
    public Tiers (String tyreType) {
        this.tyreType=tyreType;
    }
    public void addTyreBrand (String tyre) {
        tyreBrand[brandCount] =  tyre;
        brandCount++;
    }
    public int getBrandCount() {
        return  brandCount;

    }
    public String getTyreType () {
        return tyreType;
    }
    public String[] getTyreBrand() {
        return tyreBrand;
    }
}
