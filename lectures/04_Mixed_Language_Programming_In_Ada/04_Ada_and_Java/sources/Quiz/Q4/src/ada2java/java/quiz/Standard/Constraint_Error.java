/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          *
 * Original Ada unit: Standard                                               *
 * Generation timestamp: 201412281256                                        *
 *****************************************************************************/

package quiz.Standard;

/**
 */
@SuppressWarnings("all")
public final class Constraint_Error extends com.adacore.ajis.NativeException implements com.adacore.ajis.internal.ada.AdaException {

   quiz.Ada.Exceptions.Exception_Occurrence Id_JNI_323;

   private Constraint_Error (String message, int [] addr) {
      super (message);
      Id_JNI_323 = new quiz.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (addr));
      Id_JNI_323.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
      Id_JNI_323.myOwner = com.adacore.ajis.IProxy.Owner.PROXY;
   }

   public Constraint_Error (quiz.Standard.AdaString message) {
      super (message.toString());
      Id_JNI_323 = createOccurrence (message);
   }

   public int [] getExceptionAddr () {
      return Id_JNI_323.getAccess ();
   }

   /**
    * @param Message is passed by value
    * @return is passed by reference (escapable)
    */
   static public quiz.Ada.Exceptions.Exception_Occurrence createOccurrence (quiz.Standard.AdaString Message) {
      quiz.Ada2Java.Library.lock.lock ();
      try {
         quiz.Standard.AdaString Id_JNI_326 = Message;
         if (Id_JNI_326 == null) {
            throw new com.adacore.ajis.NativeException ("null not allowed for Message");
         }
         int [] Id_JNI_333;
         quiz.Standard.AdaString Id_JNI_334 = Id_JNI_326;
         Id_JNI_333 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_334).getAccess ();
         int [] Id_JNI_339 = createOccurrence_Id_JNI_324 (Id_JNI_333);
         quiz.Ada.Exceptions.Exception_Occurrence Id_JNI_340;
         if (com.adacore.ajis.internal.ada.AdaAccess.isNull (Id_JNI_339)) {
            Id_JNI_340 = null;
         } else {
            Id_JNI_340 = new quiz.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (Id_JNI_339));
         }
         quiz.Ada.Exceptions.Exception_Occurrence Id_JNI_341 = Id_JNI_340;
         if (Id_JNI_341 != null) {
            Id_JNI_341.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
         }
         quiz.Ada.Exceptions.Exception_Occurrence Id_JNI_344 = Id_JNI_341;
         return Id_JNI_344;
      } finally {
         quiz.Ada2Java.Library.lock.unlock ();
      }
   } // createOccurrence

   native static private int [] createOccurrence_Id_JNI_324 (int [] Message);

   static {
      quiz.Ada2Java.Library.load ();
   }

} // Constraint_Error
