/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          *
 * Original Ada unit: Ada.Exceptions                                         *
 * Generation timestamp: 201412180740                                        *
 *****************************************************************************/

package printer.Ada.Exceptions;

/**
 */
@SuppressWarnings("all")
public final class Exception_Occurrence extends com.adacore.ajis.internal.ada.AdaProxy {

   /**
    * @param this is passed by reference (non escapable)
    * @return is passed by reference (escapable)
    */
   final public int [] internalClone () {
      printer.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_10;
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_11 = this;
         if (Id_JNI_11 == null) {
            Id_JNI_10 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_10 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_11).getAccess ();
         }
         throw new com.adacore.ajis.NativeException ("Cannot clone an Ada limited type.");
      } finally {
         printer.Ada2Java.Library.lock.unlock ();
      }
   } // internalClone

   /**
    * @return is passed by reference (escapable)
    */
   public Exception_Occurrence () {
      super (new com.adacore.ajis.internal.ada.AdaAccess (null));
      printer.Ada2Java.Library.lock.lock ();
      try {
         this.adaAccess = Exception_Occurrence_Id_JNI_21 ();
         this.myOwner = com.adacore.ajis.IProxy.Owner.PROXY;
         this.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
      } finally {
         printer.Ada2Java.Library.lock.unlock ();
      }
   } // Exception_Occurrence

   public Exception_Occurrence (com.adacore.ajis.internal.ada.AdaAccess access) {
      this.adaAccess = access.fAcc;
   }

   /**
    * @param this is passed by reference (non escapable)
    */
   public void deallocateNativeObject () {
      printer.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_36;
         printer.Ada.Exceptions.Exception_Occurrence Id_JNI_37 = this;
         if (Id_JNI_37 == null) {
            Id_JNI_36 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_36 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_37).getAccess ();
         }
         deallocateNativeObject_Id_JNI_32 (Id_JNI_36);
      } finally {
         printer.Ada2Java.Library.lock.unlock ();
      }
   } // deallocateNativeObject

   native private int [] Exception_Occurrence_Id_JNI_21 ();

   native private void deallocateNativeObject_Id_JNI_32 (int [] Obj);

   static {
      printer.Ada2Java.Library.load ();
   }

} // Exception_Occurrence
