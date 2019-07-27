PHONIES += all configure dist sign
.PHONY: $(PHONIES)

CELLAR         = /usr/local/Cellar
GENERIC_ASSETS = /usr/local/opt/generic-assets
UPSTREAM       = `ls $(CELLAR)/android-measurement-kit/|tail -n1|tr '_' '-'`
OURS           = -android.6
VERSION_CODE   = 49
VERSION_NAME   = $(UPSTREAM)$(OURS)
OUTPUT         = android-libs-$(VERSION_NAME).aar
POM            = android-libs-$(VERSION_NAME).pom

all: dist

configure:
	./script/common/javah
	./script/android/configure $(VERSION_CODE) $(VERSION_NAME) $(GENERIC_ASSETS)

dist: configure
	./script/android/build
	./script/android/archive $(OUTPUT) $(POM) $(VERSION_NAME)

sign: dist
	./script/android/sign $(OUTPUT) $(POM)
