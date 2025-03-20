public class ClassofBank {
    String username;
    double euroAccount;
    double gelAccount;
    double usdAccount;

    ClassofBank(String username, double euroAccount, double gelAccount, double usdAccount){
        this.username = username;
        this.euroAccount = euroAccount;
        this.gelAccount = gelAccount;
        this.usdAccount = usdAccount;
    }

    void setEuroAccount(double euroAccount){
        this.euroAccount += euroAccount;
    }

    void setGelAccount(double gelAccount) {
        this.gelAccount += gelAccount;
    }

    void setUsdAccount(double usdAccount) {
        this.usdAccount += usdAccount;
    }

    public double getGelAccount() {
        return gelAccount;
    }

    public double getUsdAccount() {
        return usdAccount;
    }

    public double getEuroAccount() {
        return euroAccount;
    }

    void takeEuro(double amount){
        euroAccount -= amount;
    }

    void takeGel(double amount){
        gelAccount -= amount;
    }

    void takeUsd(double amount){
        usdAccount -= amount;
    }

    double convertor(double money, String requirement){
        double cash = 0;
        if(requirement.equals("EuroToGel")){
            cash=money*3.003;
        }else if(requirement.equals("GelToEuro")){
            cash=money*3.061;
        }else if(requirement.equals("UsdToEuro")){
            cash = money*1.107;
        }else if(requirement.equals("EuroToUsd")){
            cash = money*1.078;
        }else if(requirement.equals("UsdToGel")){
            cash = money*2.748;
        }else if(requirement.equals("GelToUsd")){
            cash = money*2.81;
        }
        return cash;
    }


    public void getInfo() {
        System.out.println( "user: "+ username + "\namount of Euro: " + euroAccount + " gel: " + gelAccount + " usd: " + usdAccount);
    }
}
