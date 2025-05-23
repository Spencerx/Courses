/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          *
 * Original Ada unit: Standard                                               *
 * Generation timestamp: 201412180740                                        *
 *****************************************************************************/

package printer.Standard;

/**
 */
@SuppressWarnings("all")
public final class Storage_Error extends com.adacore.ajis.NativeException implements com.adacore.ajis.internal.ada.AdaException {

   printer.Ada.Exceptions.Exception_Occurrence Id_JNI_300;

   private Storage_Error (String message, int [] addr) {
      super (message);
      Id_JNI_300 = new printer.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (addr));
      Id_JNI_300.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
      Id_JNI_300.myOwner = com.adacore.ajis.IProxy.Owner.PROXY;
   }

   public Storage_Error (printer.Standard.AdaString message) {
      super (message.toString());
      Id_JNI_300 = createOccurrence (message);
   }

   public int [] getExceptionAddr () {
      return Id_JNI_300.getAccess ();
   }

   /**
    * @param Message is passed by value
    * @return is passed by reference (escapable)
    */
   static public printer.Ada.Exceptions.Exception_Occurrence createOccurrence (printer.Standard.AdaString Message) {
      printer.Ada2Java.Library.lock.lock ();
      try {
         printer.Standard.AdaString Id_JNI_303 = Message;
         if (Id_JNI_303 == null) {
            throw new com.adacore.ajis.NativeException ("null not allowed for Message");
         }
         int [] Id_JNI_310;
         printer.Standard.AdaString Id_JNI_311 = Id_JNI_303;
         Id_JNI_310 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_311).getAccess ();
         int [] Id_JNI_316 = createOccurrence_Id_JNI_301 (Id_JNI_310);
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_317;
         if (com.adacore.ajis.internal.ada.AdaAccess.isNull (Id_JNI_316)) {
            Id_JNI_317 = null;
         } else {
            Id_JNI_317 = new printer.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (Id_JNI_316));
         }
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_318 = Id_JNI_317;
         if (Id_JNI_318 != null) {
            Id_JNI_318.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
         }
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_321 = Id_JNI_318;
         return Id_JNI_321;
      } finally {
         printer.Ada2Java.Library.lock.unlock ();
      }
   } // createOccurrence

   native static private int [] createOccurrence_Id_JNI_301 (int [] Message);

   static {
      printer.Ada2Java.Library.load ();
   }

} // Storage_Error
