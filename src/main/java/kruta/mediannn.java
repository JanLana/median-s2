
void main() {

    double soucet = 0;
    double cislo = -1;
    double pocetcisel = 0;
    double prumer = 0;
    List<Integer> arr = new ArrayList<Integer>();
    while (cislo != 0) {
        Scanner scanner = new Scanner(System.in);


        cislo = scanner.nextInt();

        arr.add((int) cislo);
    }
    Collections.sort(arr);

    int n = arr.size();
    double median = (arr.get((n - 1) / 2) + arr.get(n / 2)) / 2.0;
    System.out.println(median);

}