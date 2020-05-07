Play with Grafana, Prometheus and Node-Exporter
---

- install Node-Exporter
```commandline
wget --no-check-certificate https://github.com/prometheus/node_exporter/releases/download/v1.0.0-rc.0/node_exporter-1.0.0-rc.0.darwin-amd64.tar.gz
tar xvfz node_exporter-1.0.0-rc.0.darwin-amd64.tar.gz
cd node_exporter-1.0.0-rc.0.darwin-amd64
./node_exporter
```

- install Prometheus
```commandline
docker run -d --name my-prometheus -v "$(pwd)/prometheus.yml":/etc/prometheus/prometheus.yml -p 9090:9090 prom/prometheus
```

- install Grafana
```commandline
docker run -d --name my-grafana -p 3000:3000 grafana/grafana
```

reference for quick setup prometheus & grafana could be found:
https://medium.com/aeturnuminc/configure-prometheus-and-grafana-in-dockers-ff2a2b51aa1d

