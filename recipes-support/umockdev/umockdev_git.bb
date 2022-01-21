SUMMARY = "Mock hardware devices for creating unit tests and bug reporting"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/martinpitt/umockdev.git"
SRCREV = "00585c9f78832598d0b412619e1ea335bc3eca16"
PV = "0.17.5"
S = "${WORKDIR}/git"

inherit meson vala gobject-introspection features_check

# gobject-introspection is mandatory and cannot be configured
REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"
UNKNOWN_CONFIGURE_WHITELIST:append = " introspection"

DEPENDS += "glib-2.0 udev libgudev"
