with Interfaces.C;

procedure Main is

	function MyFunc return Interfaces.C.int;
	pragma Import(CPP, MyFunc, "_Z6myfuncv");

	X : Interfaces.C.int := MyFunc;

begin
	null;
end Main;
