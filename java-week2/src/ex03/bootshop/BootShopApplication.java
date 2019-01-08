package ex03.bootshop;

import java.util.List;

public class BootShopApplication {

    public static void main(String[] args) {

        BootShopAssistant assistant = new BootShopAssistant();
        List<HikingBoot> recommendation = assistant.getHikingBootRecommendation();

        Hansel hansel = new Hansel();
        hansel.tryHikingBoot(recommendation);

    }
}

