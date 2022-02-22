package Practice.immutable;

public class Address {
    private String cityName;
    private int  citeCode;


    public Address(String cityName, int citeCode) {
        this.cityName = cityName;
        this.citeCode = citeCode;
    }

    public Address(Address address) {
        this(address.cityName,address.citeCode);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCiteCode() {
        return citeCode;
    }

    public void setCiteCode(int citeCode) {
        this.citeCode = citeCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", citeCode=" + citeCode +
                '}';
    }
}
