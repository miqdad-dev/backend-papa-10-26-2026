
FROM alpine:3.20
RUN apk add --no-cache bash
WORKDIR /app
COPY . /app
CMD ["/bin/sh"]
