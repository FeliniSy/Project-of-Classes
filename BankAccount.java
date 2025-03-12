public class BankAccount {
    private String name;
    private int index;
    private String[] currencyNames;
    private float[] balances;

    public BankAccount(String name) {
        this.name = name;
        this.currencyNames = new String[10];
        this.balances = new float[10];
    }

    public void insert(String valutName, float amount){


        for(int i = 0; i < 10; i++){
            if(currencyNames[i].equals(valutName)){
                balances[i] += amount;
                return;
            }
        }
    }

    public void convertor(String fromValut, String toValut, float amount,float currency){
        float jami = 0;
        for(int i = 0; i < 10; i++){
            if(currencyNames[i].equals(fromValut)){
                jami = amount * currency;
                balances[i] -= amount;
                return;
            }
        }
        for(int i = 0; i < 10; i++){
            if(currencyNames[i].equals(toValut)){
                balances[i] += jami;
                return;
            }
        }
    }

}
