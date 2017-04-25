KV = "4.4.8"
SRCDATE = "20170424"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "57902ff34e41c5e3a2a3378b049b358f"
SRC_URI[sha256sum] = "d3d09db72f1f67022f831e926edc7ac1fb012627af9cfe69ecbe8562540b7318"

COMPATIBLE_MACHINE = "et7x00"
