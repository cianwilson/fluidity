include ../tools.mk

input: clean meshes copy_tests

meshes:
	cd src; make

copy_tests:
	cp test_A.swml test_B.swml; ${SED} -i 's/_A/_B/' test_B.swml
	cp test_A.swml test_C.swml; ${SED} -i 's/_A/_C/' test_C.swml
	cp test_A.swml test_D.swml; ${SED} -i 's/_A/_D/' test_D.swml

clean:
	rm -f *.vtu *.stat src/*.edge src/*.ele src/*.msh src/*.node test_[BCD].swml
