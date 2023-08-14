package projeto;

import java.util.Scanner;

public class Main {

    private static final int PODS_PER_NODE = 10;
    private static final int PODS_PER_SERVER = 4;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPods = scan.nextInt();

        int minNodes = (int) Math.ceil((double) totalPods / PODS_PER_NODE);
        int minServers = (int) Math.ceil((double) totalPods / PODS_PER_SERVER);

        String recommendationNode = minNodes <= 1 ? "Recomendamos usar um unico node" : "Numero minimo de nodes:" + minNodes;
        String recommendationServer = minServers <= 1 ? "Recomendamos usar um unico servidor" : "Numero minimo de servidores:" + minServers;

        System.out.println("1." + recommendationNode);
        System.out.println("2." + recommendationServer);
    }

}
