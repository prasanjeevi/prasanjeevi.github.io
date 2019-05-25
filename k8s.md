```
git clone https://github.com/mmumshad/kubernetes-the-hard-way
cd kubernetes-the-hard-way/vagrant
vagrant up

VBoxManage: error: Failed to create the host-only adapter
sudo /Library/Application\ Support/VirtualBox/LaunchDaemons/VirtualBoxStartup.sh restart


worker-1: dpkg-preconfigure: unable to re-open stdin: No such file or directory
worker-1: Warning: apt-key output should not be parsed (stdout is not a terminal)
```

vagrant ssh master-1
sudo ssh -i w/kubernetes-the-hard-way/vagrant/.vagrant/machines/master-2/virtualbox/private_key vagrant@192.168.5.12

ssh-keygen
ls .ssh/
authorized_keys  id_rsa  id_rsa.pub

cat .ssh/id_rsa.pub

cat >> ~/.ssh/authorized_keys <<EOF
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCfDKjnP5oW73WmWJSqgulZgZJS5uW3ydW/I1dUHK0jijJJblHTzYqtH5hUCdN2NhZGsvJap38ID3Df7Bbfng/nm9oCM8YmFQcsx+GS0PNFGnSo+eDplNHLKeK/LBsu3PgUIat6JDmZSYLUZMJit1gFXlbRzY36613Vh2Mo0tr6tox+3y1zQ73EKDYjBFoR7qFzLVScw/h3dHZ6ryXdtDxBE6LMlwjhjskBjCnAR8imYG2gVBMteMMB0AFE35uFXPTHwyNcsFLX13WOtiChplDoVpuJc10XKJtU0bXD6K5BR8gg939HfkHFmTr8KprXkdReX5q7Q+74sBLLsovpOWiz vagrant@master-1
EOF


