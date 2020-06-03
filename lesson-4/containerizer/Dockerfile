FROM python:3.9.0a6-buster

WORKDIR /home/env
ADD material .
RUN apt update \
    && cat pckgs.list | xargs apt install -y --no-install-recommends \
    && wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb \
    && apt install -y ./google-chrome-stable_current_amd64.deb \
    && pip3 install selenium

CMD ["python3", "pauser.py"]
