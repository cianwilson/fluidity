Point(1) = {0, 0, 0};
Extrude {0.9142, 0, 0} {
  Point{1}; Layers{256};
}
Extrude {0, -1, 0} {
  Line{1}; Layers{256};
}
Physical Line(6) = {1};
Physical Line(7) = {3};
Physical Line(8) = {2};
Physical Line(9) = {4};
Physical Surface(10) = {5};
