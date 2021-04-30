/////////////////////////////////   Singleton  ////////////////////////////////
//
//      1.  Singleton pattern is mostly used in multi-treaded & database application. It is used in logging,
//          caching,thread pools,configuration settings,etc 
//      2.  How can it achieved ?
//              I.  make constructor private // so none can access class & create object
//              II. create a single object in same class
//              III.Give access to this object
//
///////////////////////////////////////////////////////////////////////////////////////////////////

package oops.Inheritance.Singleton;

public class Appconfig {

    /*
        M-1: 
            private Appconfig(){

            }

            private static Appconfig onlyObject0 = new Appconfig();
            
            public static Appconfig getAppconfig(){
                return onlyObject0;
            }


        M-2:

    */


    private Appconfig(){
        
    }

    private static Appconfig onlyObject0 = null ;
    
    public static Appconfig getAppconfig(){
        if(onlyObject0==null){
            onlyObject0 = new Appconfig();
        }
        return onlyObject0;
    }
    
}