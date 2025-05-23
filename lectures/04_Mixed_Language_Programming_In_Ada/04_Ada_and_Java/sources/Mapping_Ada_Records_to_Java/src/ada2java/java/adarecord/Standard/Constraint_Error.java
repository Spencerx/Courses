/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          *
 * Original Ada unit: Standard                                               *
 * Generation timestamp: 201412211026                                        *
 *****************************************************************************/

package adarecord.Standard;

/**
 */
@SuppressWarnings("all")
public final class Constraint_Error extends com.adacore.ajis.NativeException implements com.adacore.ajis.internal.ada.AdaException {

   adarecord.Ada.Exceptions.Exception_Occurrence Id_JNI_458;

   private Constraint_Error (String message, int [] addr) {
      super (message);
      Id_JNI_458 = new adarecord.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (addr));
      Id_JNI_458.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
      Id_JNI_458.myOwner = com.adacore.ajis.IProxy.Owner.PROXY;
   }

   public Constraint_Error (adarecord.Standard.AdaString message) {
      super (message.toString());
      Id_JNI_458 = createOccurrence (message);
   }

   public int [] getExceptionAddr () {
      return Id_JNI_458.getAccess ();
   }

   /**
    * @param Message is passed by value
    * @return is passed by reference (escapable)
    */
   static public adarecord.Ada.Exceptions.Exception_Occurrence createOccurrence (adarecord.Standard.AdaString Message) {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         adarecord.Standard.AdaString Id_JNI_461 = Message;
         if (Id_JNI_461 == null) {
            throw new com.adacore.ajis.NativeException ("null not allowed for Message");
         }
         int [] Id_JNI_468;
         adarecord.Standard.AdaString Id_JNI_469 = Id_JNI_461;
         Id_JNI_468 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_469).getAccess ();
         int [] Id_JNI_474 = createOccurrence_Id_JNI_459 (Id_JNI_468);
         adarecord.Ada.Exceptions.Exception_Occurrence Id_JNI_475;
         if (com.adacore.ajis.internal.ada.AdaAccess.isNull (Id_JNI_474)) {
            Id_JNI_475 = null;
         } else {
            Id_JNI_475 = new adarecord.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (Id_JNI_474));
         }
         adarecord.Ada.Exceptions.Exception_Occurrence Id_JNI_476 = Id_JNI_475;
         if (Id_JNI_476 != null) {
            Id_JNI_476.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
         }
         adarecord.Ada.Exceptions.Exception_Occurrence Id_JNI_479 = Id_JNI_476;
         return Id_JNI_479;
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // createOccurrence

   native static private int [] createOccurrence_Id_JNI_459 (int [] Message);

   static {
      adarecord.Ada2Java.Library.load ();
   }

} // Constraint_Error
