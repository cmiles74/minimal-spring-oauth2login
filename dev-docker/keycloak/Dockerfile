FROM quay.io/keycloak/keycloak:latest

ENTRYPOINT ["/opt/keycloak/bin/kc.sh", \
            "start-dev", \
            "--import-realm", \
            "--spi-theme-static-max-age=-1", \
            "--spi-theme-cache-themes=false", \
            "--spi-connections-http-client-default-disable-trust-manager=true", \
            "--hostname-strict=false"]
