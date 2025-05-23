-------------------------------------------------------------------------------
-- This file has been automatically generated by                             --
--    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          --
-- Original Ada unit: Record_Types                                           --
-- Generation timestamp: 201412211026                                        --
-------------------------------------------------------------------------------

pragma Warnings (Off);
pragma Style_Checks ("NM32766");

with Interfaces.Java.JNI;
with AJIS;
with AJIS.Internal;
with AJIS.Java;
with AJIS.Internal.Java;
with Ada.Characters.Conversions;
with Ada.Finalization;
with Record_Types; use Record_Types;
with Record_Types;

package JNI_Binding.Record_Types_JNI.A_Nested_Record_Type_JNI is 

   procedure JNI_For_Body_Elaboration;

   procedure Initialize_Unit_JNI (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access);

   function Id_JNI_42 (Left : access constant Record_Types.A_Nested_Record_Type; Right : access constant Record_Types.A_Nested_Record_Type) return Standard.Boolean;

   function equals_Id_JNI_41 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_2 : Interfaces.Java.JNI.J_Object; Left : Interfaces.Java.JNI.J_Int_J_Array; Right : Interfaces.Java.JNI.J_Int_J_Array) return Interfaces.Java.JNI.J_Boolean;
   pragma Export (C, equals_Id_JNI_41, "Java_adarecord_Record_1Types_A_1Nested_1Record_1Type_equals_1Id_1JNI_141___3I_3I");

   function Id_JNI_59 (This : access Record_Types.A_Nested_Record_Type) return access Record_Types.A_Nested_Record_Type;

   function internalClone_Id_JNI_58 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_2 : Interfaces.Java.JNI.J_Object; This : Interfaces.Java.JNI.J_Int_J_Array) return Interfaces.Java.JNI.J_Int_J_Array;
   pragma Export (C, internalClone_Id_JNI_58, "Java_adarecord_Record_1Types_A_1Nested_1Record_1Type_internalClone_1Id_1JNI_158___3I");

   function Id_JNI_76 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_2 : Interfaces.Java.JNI.J_Object) return access Record_Types.A_Nested_Record_Type;

   function A_Nested_Record_Type_Id_JNI_75 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_2 : Interfaces.Java.JNI.J_Object) return Interfaces.Java.JNI.J_Int_J_Array;
   pragma Export (C, A_Nested_Record_Type_Id_JNI_75, "Java_adarecord_Record_1Types_A_1Nested_1Record_1Type_A_1Nested_1Record_1Type_1Id_1JNI_175__");

   procedure Id_JNI_87 (Obj : access Record_Types.A_Nested_Record_Type);

   procedure deallocateNativeObject_Id_JNI_86 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_2 : Interfaces.Java.JNI.J_Object; Obj : Interfaces.Java.JNI.J_Int_J_Array);
   pragma Export (C, deallocateNativeObject_Id_JNI_86, "Java_adarecord_Record_1Types_A_1Nested_1Record_1Type_deallocateNativeObject_1Id_1JNI_186___3I");

   function Id_JNI_94 (This : access Record_Types.A_Nested_Record_Type) return Standard.Integer;

   function Integer_Field_Id_JNI_93 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_2 : Interfaces.Java.JNI.J_Object; This : Interfaces.Java.JNI.J_Int_J_Array) return Interfaces.Java.JNI.J_Int;
   pragma Export (C, Integer_Field_Id_JNI_93, "Java_adarecord_Record_1Types_A_1Nested_1Record_1Type_Integer_1Field_1Id_1JNI_193___3I");

   procedure Id_JNI_108 (This : access Record_Types.A_Nested_Record_Type; Value : Standard.Integer);

   procedure Integer_Field_Id_JNI_107 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_2 : Interfaces.Java.JNI.J_Object; This : Interfaces.Java.JNI.J_Int_J_Array; Value : Interfaces.Java.JNI.J_Int);
   pragma Export (C, Integer_Field_Id_JNI_107, "Java_adarecord_Record_1Types_A_1Nested_1Record_1Type_Integer_1Field_1Id_1JNI_1107___3II");

   Id_JNI_39 : AJIS.Internal.Java.Java_Method_Access := AJIS.Internal.Java.Get_Java_Method ("adarecord/Record_Types/A_Nested_Record_Type", "<init>", "(Lcom/adacore/ajis/internal/ada/AdaAccess;)V");

end JNI_Binding.Record_Types_JNI.A_Nested_Record_Type_JNI;
