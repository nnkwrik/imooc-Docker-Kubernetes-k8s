FROM hub.nnkwrik.com/micro-service/python-base:latest
MAINTAINER nnkwrik nnkwrik@gmail.com

ENV PYTHONPATH /
COPY message /message

ENTRYPOINT ["python","/message/message_service.py"]