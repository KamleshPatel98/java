class Star1 {
    public static void main(String[] arg){
        for(var i=0; i<4; i++){
            for(var j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

//Output
// *
// **
// ***
// ****