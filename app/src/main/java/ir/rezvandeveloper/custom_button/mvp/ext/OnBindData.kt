package info.alirezaahmadi.taskapplearn.mvp.ext

import info.alirezaahmadi.taskapplearn.db.model.TaskEntity

interface OnBindData {

    fun saveData(taskEntity: TaskEntity) {}

    fun editData(taskEntity: TaskEntity) {}

    fun deleteData(taskEntity: TaskEntity) {}

    fun getData(taskEntity: List<TaskEntity>) {}

    fun requestData(state: Boolean) {}

}