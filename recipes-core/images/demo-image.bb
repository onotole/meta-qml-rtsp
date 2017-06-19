include recipes-core/images/rpi-test-image.bb

IMAGE_FEATURES += "\
    package-management \
    dbg-pkgs \
    tools-debug \
"

IMAGE_INSTALL += "\
    qt-multimedia-omxil \
    qtbase \
    qtbase-plugins \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtdeclarative-tools \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
"
