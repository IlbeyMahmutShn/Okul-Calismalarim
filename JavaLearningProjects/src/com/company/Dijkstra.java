public class Dijkstra {

    public static void dijkstra(int[][] graph, int kok) {
        int sayac = graph.length;
        boolean[] gezilenDugum = new boolean[sayac];
        int[] mesafe = new int[sayac];
        for (int i = 0; i < sayac; i++) {
            gezilenDugum[i] = false;
            mesafe[i] = Integer.MAX_VALUE;
        }

        // Öz döngü mesafesi sıfırdır
        mesafe[kok] = 0;
        for (int i = 0; i < sayac; i++) {

            // Komşu tepe noktası ile kaynak tepe noktası arasındaki mesafeyi güncelleyin
            int u = minMesafe(mesafe, gezilenDugum);
            gezilenDugum[u] = true;

            // Tüm komşu köşe mesafelerini güncelle
            for (int v = 0; v < sayac; v++) {
                if (!gezilenDugum[v] && graph[u][v] != 0 && (mesafe[u] + graph[u][v] < mesafe[v])) {
                    mesafe[v] = mesafe[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < mesafe.length; i++) {
            System.out.println(String.format("Uzaklık %s to %s ile %s", kok, i, mesafe[i]));
        }

    }

    //Minimum mesafeyi bulma
    private static int minMesafe(int[] mesafe, boolean[] gezilenDugum) {
        int minMesafe = Integer.MAX_VALUE;
        int minMesafeDugum = -1;
        for (int i = 0; i < mesafe.length; i++) {
            if (!gezilenDugum[i] && mesafe[i] < minMesafe) {
                minMesafe = mesafe[i];
                minMesafeDugum = i;
            }
        }
        return minMesafeDugum;
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 2, 1, 0, 0, 0 }, { 2, 0, 0, 2, 5, 0 }, { 1, 0, 0, 0, 2, 1 },
                                      { 0, 2, 0, 0, 0, 7 }, { 0, 5, 2, 0, 0, 5 }, { 0, 0, 1, 7, 5, 0 } };
        Dijkstra T = new Dijkstra();
        T.dijkstra(graph, 0);
    }
}