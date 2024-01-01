SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
SRC_URI = "file://main.conf"

do_install() {
    install -d ${D}/etc/connman
    install -m 0644 ${WORKDIR}/main.conf ${D}/etc/connman/main.conf
}

