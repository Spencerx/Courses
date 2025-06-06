/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          *
 * Original Ada unit: Standard                                               *
 * Generation timestamp: 201501031502                                        *
 *****************************************************************************/

package jprinter.Standard;

/**
 */
@SuppressWarnings("all")
public final class Storage_Error extends com.adacore.ajis.NativeException implements com.adacore.ajis.internal.ada.AdaException {

   jprinter.Ada.Exceptions.Exception_Occurrence Id_JNI_325;

   private Storage_Error (String message, int [] addr) {
      super (message);
      Id_JNI_325 = new jprinter.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (addr));
      Id_JNI_325.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
      Id_JNI_325.myOwner = com.adacore.ajis.IProxy.Owner.PROXY;
   }

   public Storage_Error (jprinter.Standard.AdaString message) {
      super (message.toString());
      Id_JNI_325 = createOccurrence (message);
   }

   public int [] getExceptionAddr () {
      return Id_JNI_325.getAccess ();
   }

   /**
    * @param Message is passed by value
    * @return is passed by reference (escapable)
    */
   static public jprinter.Ada.Exceptions.Exception_Occurrence createOccurrence (jprinter.Standard.AdaString Message) {
      jprinter.Ada2Java.Library.lock.lock ();
      try {
         jprinter.Standard.AdaString Id_JNI_328 = Message;
         if (Id_JNI_328 == null) {
            throw new com.adacore.ajis.NativeException ("null not allowed for Message");
         }
         int [] Id_JNI_335;
         jprinter.Standard.AdaString Id_JNI_336 = Id_JNI_328;
         Id_JNI_335 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_336).getAccess ();
         int [] Id_JNI_341 = createOccurrence_Id_JNI_326 (Id_JNI_335);
         jprinter.Ada.Exceptions.Exception_Occurrence Id_JNI_342;
         if (com.adacore.ajis.internal.ada.AdaAccess.isNull (Id_JNI_341)) {
            Id_JNI_342 = null;
         } else {
            Id_JNI_342 = new jprinter.Ada.Exceptions.Exception_Occurrence (new com.adacore.ajis.internal.ada.AdaAccess (Id_JNI_341));
         }
         jprinter.Ada.Exceptions.Exception_Occurrence Id_JNI_343 = Id_JNI_342;
         if (Id_JNI_343 != null) {
            Id_JNI_343.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
         }
         jprinter.Ada.Exceptions.Exception_Occurrence Id_JNI_346 = Id_JNI_343;
         return Id_JNI_346;
      } finally {
         jprinter.Ada2Java.Library.lock.unlock ();
      }
   } // createOccurrence

   native static private int [] createOccurrence_Id_JNI_326 (int [] Message);

   static {
      jprinter.Ada2Java.Library.load ();
   }

} // Storage_Error
