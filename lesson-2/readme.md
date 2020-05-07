Play with Image & Registry
---

##### Create Image and run container
- launch demo app locally
```commandline
node app.js
```
then, check `http://localhost:3000`

- create simple image
```commandline
docker build --rm -f Dockerfile --tag=demo-app:latest .
```
> try to add different tags

- run container
```commandline
docker run -d --name my-demo -p 3000:3000 demo-app:latest
```
then, check `http://localhost:3000`

##### Deploy local registry
- launch registry container
```commandline
docker run -d -p 5000:5000 --restart=always --name registry registry:2
```

- push local image to local registry
```commandline
docker tag demo-app:latest localhost:5000/demo-app:latest
docker image push localhost:5000/demo-app:latest
```

- pull and launch container with image from local registry
```commandline
docker container run -d --name my-demo -p 3000:3000 localhost:5000/demo-app:latest
```

> exercise 1, pull and push image from yourself Docker Hub.
>
> exercise 2, pull and push image from a shared registry.
