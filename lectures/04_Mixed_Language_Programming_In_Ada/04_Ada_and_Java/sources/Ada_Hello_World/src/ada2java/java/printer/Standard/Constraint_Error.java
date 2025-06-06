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
public final class Constraint_Error extends com.adacore.ajis.NativeException implements com.adacore.ajis.internal.ada.AdaException {

   printer.Ada.Exceptions.Exception_Occurrence Id_JNI_252;

   private Constraint_Error (String message, int [] addr) {
      super (message);
      Id_JNI_252 = new printer.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (addr));
      Id_JNI_252.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
      Id_JNI_252.myOwner = com.adacore.ajis.IProxy.Owner.PROXY;
   }

   public Constraint_Error (printer.Standard.AdaString message) {
      super (message.toString());
      Id_JNI_252 = createOccurrence (message);
   }

   public int [] getExceptionAddr () {
      return Id_JNI_252.getAccess ();
   }

   /**
    * @param Message is passed by value
    * @return is passed by reference (escapable)
    */
   static public printer.Ada.Exceptions.Exception_Occurrence createOccurrence (printer.Standard.AdaString Message) {
      printer.Ada2Java.Library.lock.lock ();
      try {
         printer.Standard.AdaString Id_JNI_255 = Message;
         if (Id_JNI_255 == null) {
            throw new com.adacore.ajis.NativeException ("null not allowed for Message");
         }
         int [] Id_JNI_262;
         printer.Standard.AdaString Id_JNI_263 = Id_JNI_255;
         Id_JNI_262 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_263).getAccess ();
         int [] Id_JNI_268 = createOccurrence_Id_JNI_253 (Id_JNI_262);
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_269;
         if (com.adacore.ajis.internal.ada.AdaAccess.isNull (Id_JNI_268)) {
            Id_JNI_269 = null;
         } else {
            Id_JNI_269 = new printer.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (Id_JNI_268));
         }
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_270 = Id_JNI_269;
         if (Id_JNI_270 != null) {
            Id_JNI_270.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
         }
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_273 = Id_JNI_270;
         return Id_JNI_273;
      } finally {
         printer.Ada2Java.Library.lock.unlock ();
      }
   } // createOccurrence

   native static private int [] createOccurrence_Id_JNI_253 (int [] Message);

   static {
      printer.Ada2Java.Library.load ();
   }

} // Constraint_Error
