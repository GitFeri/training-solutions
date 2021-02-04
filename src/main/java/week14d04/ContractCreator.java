package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
    template = new Contract(client,monthlyPrices);
    }

    public Contract createContract(String client){
        return new Contract(client,template.getMonthlyPrices());
    }

    public Contract getTemplate() {
        return template;
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("John Doe",new ArrayList<>(List.of(10,10,10,10,10,20,30,40,50,60)));
        System.out.println(cc.getTemplate().getMonthlyPrices());
        cc.createContract("John Smith").getMonthlyPrices().set(1,20);
        System.out.println(cc.getTemplate().getMonthlyPrices());
    }
}
