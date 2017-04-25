KV = "4.4.8"
SRCDATE = "20170424"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "620832435a97a5580283efa4fb8d1f93"
SRC_URI[sha256sum] = "6b2429a25e10bc6e6fee87c28e3d2c67363a6d0c7b499656320cc90e0175cd0e"

COMPATIBLE_MACHINE = "et8500"
