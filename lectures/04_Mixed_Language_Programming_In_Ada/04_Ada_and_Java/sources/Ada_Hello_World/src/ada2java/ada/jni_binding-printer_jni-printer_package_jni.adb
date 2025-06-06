-------------------------------------------------------------------------------
-- This file has been automatically generated by                             --
--    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          --
-- Original Ada unit: Printer                                                --
-- Generation timestamp: 201412180740                                        --
-------------------------------------------------------------------------------

pragma Warnings (Off);
pragma Style_Checks ("NM32766");

with Ada.Unchecked_Deallocation;
with System.Address_To_Access_Conversions;
with Ada.Unchecked_Conversion;
with Ada.Tags;
with Ada.Exceptions;
with Interfaces.C;
with Interfaces.C.Strings;

package body JNI_Binding.Printer_JNI.Printer_Package_JNI is 

   procedure JNI_For_Body_Elaboration is begin null; end;

   procedure Initialize_Unit_JNI (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access) is
   begin

      null;
   end Initialize_Unit_JNI;

   procedure Id_JNI_40 (Me : Standard.String) is
   begin
      Printer.Print (Me => Me);
   end Id_JNI_40;

   procedure Print_Id_JNI_39 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_3 : Interfaces.Java.JNI.J_Class; Me : Interfaces.Java.JNI.J_Int_J_Array) is
   begin
      declare
         Id_JNI_44 : JNI_Binding.Standard_JNI.Id_JNI_43.Object_Pointer := JNI_Binding.Standard_JNI.Id_JNI_43.To_Object_Pointer (Id_JNI_1, Me);
         Id_JNI_49 : constant System.Address := JNI_Binding.Standard_JNI.Id_JNI_43.Get_Address (Id_JNI_44);
         subtype Id_JNI_45 is Standard.String (Id_JNI_44.Bound_1_Low .. Id_JNI_44.Bound_1_High);
         type Id_JNI_46 is access all Id_JNI_45;
         package Id_JNI_47 is new System.Address_To_Access_Conversions (Id_JNI_45);
         Id_JNI_48 : JNI_Binding.Standard_JNI.Id_JNI_43.Array_Pointer_Cst;
      begin
         if AJIS.Internal.Java."=" (Id_JNI_44.Kind, AJIS.Internal.Java.Static) then
            Id_JNI_48 := Id_JNI_47.To_Pointer (Id_JNI_49).all'Unrestricted_Access;
         elsif AJIS.Internal.Java."=" (Id_JNI_44.Kind, AJIS.Internal.Java.General_Access) then
            Id_JNI_48 := JNI_Binding.Standard_JNI.Id_JNI_43.Array_Pointer_Cst (Id_JNI_44.General_Pointer);
         else
            Id_JNI_48 := JNI_Binding.Standard_JNI.Id_JNI_43.Array_Pointer_Cst (Id_JNI_44.Constant_Pointer);
         end if;
         declare
         begin
            Id_JNI_40 (Standard.String (Id_JNI_48.all));
         end;
      end;
   exception
      when J : AJIS.Java.Java_Exception =>
         declare
            Result : Interfaces.Java.JNI.J_Int;
         begin
            Result := Interfaces.Java.JNI.Throw (Id_JNI_1, AJIS.Internal.Java.Throwable_Value (Ada.Exceptions.Exception_Message (J)));
         end;
      when E : others =>
         declare
            Result : Interfaces.Java.JNI.J_Int;
            Except : Interfaces.Java.JNI.J_Object;
         begin
            Except := AJIS.Internal.Java.Create_Java_Exception (Id_JNI_1, E);
            if Interfaces.Java.JNI."=" (Except, Interfaces.Java.JNI.J_Null_Object) then
               Result := Interfaces.Java.JNI.Throw_New (Id_JNI_1, AJIS.Internal.Java.Get_Class (AJIS.Internal.Java.Native_Exception_Class), Interfaces.C.To_C (Ada.Exceptions.Exception_Information (E)));
            else
               Result := Interfaces.Java.JNI.Throw (Id_JNI_1, Except);
            end if;
         end;
   end Print_Id_JNI_39;

begin
   null;
end JNI_Binding.Printer_JNI.Printer_Package_JNI;
