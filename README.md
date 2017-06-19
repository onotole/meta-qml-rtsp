# meta-qml-rtsp

Meta layer with basic qt media plyback integration for raspberrypi platform.

# howto

git clone git://git.yoctoproject.org/poky -b morty
cd poky
git clone git://git.openembedded.org/meta-openembedded -b morty
git clone https://github.com/meta-qt5/meta-qt5.git -b morty
git clone git://git.yoctoproject.org/meta-raspberrypi -b morty
git clone https://github.com/onotole/meta-qml-rtsp.git -b morty
cd ..
. poky/oe-init-build-env

edit conf/bblayers.conf and conf/local.conf

bitbake demo-image

have fun...
