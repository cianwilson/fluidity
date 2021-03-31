FROM fluidity/baseimages:groovy

USER root

RUN apt-get -y update && \
      apt-get -y dist-upgrade && \
      rm -rf /var/cache/apt/archives && \
      rm -rf /var/lib/apt/lists

COPY . /home/fluidity
RUN chown -R fluidity /home/fluidity

USER fluidity

RUN ./configure --enable-2d-adaptivity
RUN make
RUN make fltools
