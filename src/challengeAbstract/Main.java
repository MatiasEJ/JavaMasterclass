package challengeAbstract;


public class Main {
    public static void main(String[] args) {
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data  = stringData.split( " ");
        SearchTree list = new SearchTree(null);
        for(String s : data){
            /*Create new item with value of data*/
            list.addItem(new Node(s));
        }

        list.transverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.transverse(list.getRoot());
    }
}
