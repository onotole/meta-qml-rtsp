inherit qmake5

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/onotole/qt-multimedia-omxil.git"
SRCREV = "5916a99b187c217af4b347bc49cdee6c25aedfcc"

S = "${WORKDIR}/git"

DEPENDS += "userland qtbase qtmultimedia ffmpeg"
RDEPENDS_${PN} += "qtbase qtmultimedia ffmpeg libavcodec libavformat libswscale"

FILES_${PN} += " ${bindir}/omx-player ${libdir}/qt5 ${datadir}/examples"
FILES_${PN}-dev = "${libdir}/cmake"
