//ADVANCE RECURSION PROBLEMS

//Q1.Print all the permutations of a string 
/* 
class AdvanceRecursion {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + currChar);
        }
    }
    public static void main(String args[]) {
        String str = "abc";
        printPerm(str, "");
    }
}
*/

//Q2.Count the total path in a maze to move from (0,0) to (n,m)
/* 
class AdvanceRecursion {
    public static int countPaths(int i,int j, int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //MOVE DOWNWARDS
        int downPaths=countPaths(i+1,j,n,m);

        //MOVE RIGHT
        int righPaths=countPaths(i,j+1,n,m);

        return downPaths+righPaths;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int totalpaths=countPaths(0,0,n,m);
        System.out.println(totalpaths);
    }
}
*/

//Q3.Place tiles of size 1 x m in a floor size of n x m
/* 
class AdvanceRecursion {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //COUNTING VERTICAL TILES
        int verticalTiles=placeTiles(n-m,m);

        //COUNTING HORIZONTAL TILES
        int horizontalTiles=placeTiles(n-1,m);

        //TOTAL TILES
        return verticalTiles+horizontalTiles;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(placeTiles(n,m));
    }
}
*/

//Q4.Find the total number of ways in which you can invite n guests to your party in either single or in pair form 
class AdvanceRecursion {
    public static int inviteGuest(int n){
        if(n<=1){
            return 1;
        }
        //SINGLE GUEST
        int singleGuest=inviteGuest(n-1);

        //PAIRED GUEST
        int pairedGuest=(n-1) * inviteGuest(n-2);

        //TOTAL WAYS
        return singleGuest+pairedGuest;
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(inviteGuest(n));
    }
}
