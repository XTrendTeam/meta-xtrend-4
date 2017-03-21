KV = "4.4.8"
SRCDATE = "20170318"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "f2918f7c35faee990407ab62be68c112"
SRC_URI[sha256sum] = "4428973294814056fb815e0dde1f78ca60c845402c5afd24e1a5f12b3a24ddb8"

COMPATIBLE_MACHINE = "et8500"
