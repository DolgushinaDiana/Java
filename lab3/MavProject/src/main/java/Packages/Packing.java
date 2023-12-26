package Packages;

import Packages.classes.Package;

public interface Packing {
    int findNetto();
    int findBrutto();
    Package getPac();
    String getName();
    String toString();
}
