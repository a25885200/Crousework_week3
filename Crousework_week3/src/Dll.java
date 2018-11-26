/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leung
 */
public class Dll {
    
 public static DoublyList dl = new DoublyList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herex
        
        dl.addToTail(123);
        dl.addToTail(321);
        dl.addToTail(12);
        dl.addToTail(923);
        dl.addToTail(143);
        dl.addToTail(1003);
        dl.addToTail(new DoublyNode(13));
        dl.addToTail(new DoublyNode(100));
        dl.addToTail(new DoublyNode(69));
        dl.addToTail(new DoublyNode(9));
        
        
        System.out.println(dl.forward());
        System.out.println(dl.backward());
    }

    /*public static int[] doSelectionSort(DoublyList dll){
         
        for (int i = 0; i < dll.getCount() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < dll.getCount(); j++){
                if(dl.)
            }
                
      
            
        }
        return dll;
    }*/
}
